object main extends App{
    val p = Point(1,2)
    println(p)
}

case class Point(a:Int,b:Int){
    def x:Int = a;
    def y:Int = b;

    //Question 01
    def +(p:Point)=Point(this.x+p.x,this.y+p.y);

    //Question 02
    def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy);

    //Question 03
    def distance(p1:Point,p2:Point) = math.sqrt(math.pow(p1.x-p2.x,2)+math.pow(p1.y-p2.y,2));

    //Question 04
    def invert(p:Point)=Point(this.y,this.x);
}