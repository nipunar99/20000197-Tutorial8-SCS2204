object main extends App{
    val p1 = Point(1,2)
    val p2 = Point(4,5)
    println("Point1 = "+p1)
    println("Point2 = "+p2)
    println();

    println("Point1 + Point2 = "+(p1+p2))
    println("Move p1 by dx=3 and dy=5 : "+p1.move(3,5))
    println("Distance between p1 and p2 : "+p1.distance(p2))
    println("Invert p1(1,2) : "+p1.invert())
}

case class Point(a:Int,b:Int){
    def x:Int = a;
    def y:Int = b;

    //Question 01
    def +(p:Point)=Point(this.x+p.x,this.y+p.y);

    //Question 02
    def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy);

    //Question 03
    def distance(p:Point) = math.sqrt(math.pow(this.x-p.x,2)+math.pow(this.y-p.y,2));

    //Question 04
    def invert()=Point(this.y,this.x);
}