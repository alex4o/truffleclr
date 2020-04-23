#/bin/env python

import matplotlib.pyplot as plt
import pandas


import argparse

parser = argparse.ArgumentParser(description='Plot graphs.')
parser.add_argument('tables', metavar='N', type=str, nargs='+',
                    help='tables')

parser.add_argument('--title', type=str, help='title')

args = parser.parse_args()

handles = []
ax = plt.gca()

for table in args.tables:
    df = pandas.read_csv(table, names=["type", "number", "time"])
    print( int(df.time.mean()), "&", int(df.time.max()), "&" , int(df.time.nsmallest(3).mean()) )
    
    handles.append( df.plot(x="number", y="time",  ylim=(10, 60), ax=ax) )



h, l = ax.get_legend_handles_labels()

ax.set_title(args.title)
ax.set_ylabel('time (ms)')
ax.set_xlabel('iteration')

plt.legend(h, ["Mono 6.4.0", "TruffleClr"])
plt.savefig(args.title + ".pdf")
