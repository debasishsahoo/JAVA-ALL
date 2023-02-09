# A Class is a blue print which you use to create Object,An Object is an instance of a class


<pre>
public class House{
    int nOfRoom;
    int nOfBathRooms;
}


House SahusHouse= new House();
House PolysHome= new House();
House EvansHome= new House();
House MantusHome= new House();

</pre>

# * PolysHome is an Object of House Class same as PolysHome is an Object of type House class


<ul>
<li>Instance is Logical but object is Physical means occupies some memory.</li>

<li>We can create an instance for abstract class as well as for interface, but we cannot create an object for those.</li>

<li>Object is instance of class and instance means representative of class i.e object.</li>

<li>Instance refers to Reference of an object.</li>

<li>Object is actually pointing to memory address of that instance.</li>

<li>You can’t pass instance over the layers but you can pass the object over the layers</li>

<li>You can’t store an instance but you can store an object</li>

<li>A single object can have more than one instance. </li>

<li>Instance will have the both class definition and the object definition where as in object it will have only the object definition.</li>

</ul>



<pre>
public class House{
    int nOfRoom;
    int nOfBathRooms;
}


House SahusHouse;   => Instance (Memory Allocation -> false, return only a pointer or memory address refers to an object)

House PolysHome= new House();  => Object (Memory Allocation -> true)

</pre>

# Class => Structure
# Object => Physical Mainfestation
# Instance => each object created from class (Logical Mainfestation)
# Reference => Address of an Object
















