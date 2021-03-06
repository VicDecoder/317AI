# 317AI

The M-N-K-Y Problem




The problem is to get N>0 packages delivered, using M>0 vehicles.  Each package has a source and a destination.  The M vehicles start and end their routes at a garage.  A vehicle can carry upto K>0 packages at a time.  We'll assume that the number of vehicles is less than or equal to the number of packages M<=N.

Underlying the problem is a "city" described with Y dimensions.  When Y=1, the city is laid out on a one-dimensional line (like an elevator).  When Y=2, the city is laid out in 2 dimensions (more like a city).  The parameter Y tells you how many coordinates you need to represent the locations of the vehicles and packages.

Assume that the city is a unit square in Y dimensions.  That is, locations coordinates can be in the range [0,1].  The garage is always at the origin.  Packages have a source, and a destination, which are locations within the city.  For example, if Y=2, a package source is described by a 2D coordinate.  We will assume that a package source and destination are distinct (no package source is the same as its destination).

A vehicle is allowed to travel to any location in the city from any location in the city.  In other words, the only locations that matter are the garage, and the packages' sources and destinations. 

This is not a path planning problem.  You have no map.

The packages can be picked up in any order, and delivered in any order, provided that no more than K packages are in any vehicle at any time.  

The objective is to produce a plan that indicates how the M vehicles deliver the N packages, in the form of a sequence of pick-ups and drop-offs.

The cost of a plan must consider the total distance travelled by all vehicles: you must try to minimize this total distance.  The cost must also consider the time taken to deliver the packages; you must try to minimize the time that the vehicles are on the road.  For example, your best solution for M=3 should involve 3 vehicles; allowing one vehicle to do all the work may not be the best solution.  Since all vehicles travel at the same speed, the time taken by any vehicle is proportional to the distance travelled.  

Cost equals the sum of the distances travelled by all vehiicles plus the maximum distance travelled by any vehicle.

You can start with a few hard-coded M-N-K-Y problems, but you'll want to implement a random problem generator that puts N sources and destinations in the city at random locations.  You'll want to report average performance (run-time, solution cost, etc) for the problems you solve.

Note: this is a hard search problem.  If you can't push M,N,K,Y very far, don't stress.  Report on what you did.  Report on what the limitations are, and how you might address them.  At all times, your best attitude is to demonstrate how well you understand search as a result of working on this problem.  It's open ended, and "project-like" but keep in mind it is only 1 assignment out of 4.  





Package Dependencies
import java.util.LinkedList
import java.util.Stack
import java.util.queue
import java.util.ArrayList
