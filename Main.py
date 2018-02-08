try:
    import queue
except ImportError:
    import Queue as queue

class Locations:
    x =0
    y = 0
    def __init__(self):
        self
    def getX(self):
        return self.x
    def getY(self):
        return self.y
    def setX(self,var):
        self.x =var
    def setY(self,var):
        self.y = var
    def getLocation(self):
        return [self.x,self.y]

cgit
class Package(Locations):
    pos = None
    dest = None
    #key = None
    def __init__(self, p, d):
        self.pos = p
    	self.setX(self.pos)
        self.dest = d
        #self.key = k

    def getPost(self):
        return self.pos

    def getDest(self):
        return self.dest

    #def getKey(self):
         #return self.key


class State:
    vehicle = None
    package = None
    carry = False

    def __init__(self,v,p,c):
        self.vehicle = v
        self.package = p
        self.carry = c



    def getVehicle(self):
        return self.vehicle
    def getPackages(self):
        return self.package
    def getCarry(self):
        return self.carry
    def setCarry(self,variable):
        self.carry = variable
    def setPackageLocation(self,var):
        self.package=Locations.setY(var)
    def setVehicleLocation(self,var):
        self.vehicle = Locations.setY(var)
    def __str__(self):
        word="v= {self.vehicle.getX()}"
        word=word+" p= {self.package.getX()}"
        word=word+" c={self.getCarry()}"
        return word
    




class Problem:
    state = None
    queue=None



    def __init__(self,s):
        self.state  = s
        self.queue=[]
    def successor(self,state):
        if(state.vehicle.getX() == 0 and state.getCarry() == False and state.package.getX() == state.package.getPost()):
            victor = State(state.getVehicle(),state.getPackages(),state.getCarry())
            victor.setCarry(True)
            victor.vehicle.setX(state.package.getPost())

            victor.__str__()
            self.successor(victor)
            self.queue.append(victor)
        if(state.vehicle.getX() == state.package.getPost() and state.getCarry() == True):
            surj =  State(state.getVehicle(),state.getPackages(),state.getCarry())
            surj.setCarry(False)
            surj.vehicle.setX(state.package.getDest())
            surj.package.setX(state.package.getDest())
            self.queue.append(surj)
            surj.__str__()
            self.successor(surj)

        if(state.vehicle.getX() == state.package.getDest() and state.getCarry() == False):
            lar =  State(state.getVehicle(),state.getPackages(),state.getCarry())
            lar.vehicle.setX(0)

            self.queue.append(lar)
            lar.__str__()
            self.successor(lar)


    def getQueue(self):
        return self.queue
    def printQueue(self):
        print (self.queue)

    def isGoal(self,state):
        if(state.vehicle.getX()==0 and state.package.getX()==state.package.getDest()and state.getCarry()==False):
            return True
        return False
    def search(self,state):
        value = True
        while value:
            self.queue.pop()


class Search:


    def search(self,problem,state):
        queue=[]
        queue.append(init_state)

        while len(queue)>=0:
            here=queue.pop()
            if problem.isGoal(here):
                print(here)
            else:
                problem.successor(here)
                next=problem.getQueue()
                for s in next:
                    queue.append(s)
        return "The stuff didnt work"















carry = False
p = Package(1,2)
v = Vehicle()
init_state = State(v,p,carry)
v.setX(0)
print "The initial state is: "
print(init_state.__str__())
prob = Problem(init_state)
prob.successor(init_state)

test = Search()
test.search(prob, init_state)