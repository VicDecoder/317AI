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

class Vehicle(Locations):
    packages = None
    def __init__(self):
        self.packages = []

    def addPackage(self, p):
        self.packages.append(p)

    def removePackage(self, p):
        self.package.pop(p.getKey())

class Package(Locations):
    pos = None
    dest = None
    #key = None
    def __init__(self, p, d):
        self.pos = p
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
    def getString(self):
        print('v', self.vehicle.getX())
        print('p',self.package.getX())
        


class Problem:
    state = None



    def __init__(self,s):
        self.state  = s
    def successor(self,state):
        if(state.vehicle.getX() == 0 and state.getCarry() == False and state.package.getX() == state.package.getPost()):
            victor = state
            victor.setCarry(True)
            victor.vehicle.setX(state.package.getPost())
            queue.Queue.put(victor)
            victor.getString()
        if(state.vehicle.getX() == state.package.getPost() and state.getCarry() == True):
            surj = state
            surj.setCarry(False)
            surj.package.setX(state.package.getDest())
            queue.Queue.put(surj)
            surj.getString()

        if(state.vehicle.getX() == state.package.getDest() and state.getCarry() == False):
            lar = state
            lar.vehicle.setX(0)
            queue.Queue.put(lar)
            lar.getString()








carry = False
p = Package(1,2)
v = Vehicle()
a = State(v,p,carry)
print("The initial state is: ",a.getString())
s = Problem(a)



s.successor(a)












