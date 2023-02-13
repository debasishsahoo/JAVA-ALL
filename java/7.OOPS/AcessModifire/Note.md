# Access Modifire

## All member of JAVA can be assigned with the acess modifire

<table border='1'>
<tr>
<th>Member of Java</th>
<th>Private</th>
<th>Default</th>
<th>Protected</th>
<th>Public</th>
</tr>
<tr>
<th>Class</th>
<td>NO</td>
<td>YES</td>
<td>NO</td>
<td>YES</td>
</tr>
<tr>
<th>Variable</th>
<td>YES</td>
<td>YES</td>
<td>YES</td>
<td>YES</td>
</tr>
<tr>
<th>Method</th>
<td>YES</td>
<td>YES</td>
<td>YES</td>
<td>YES</td>
</tr>
<tr>
<th>Constructor</th>
<td>YES</td>
<td>YES</td>
<td>YES</td>
<td>YES</td>
</tr>
<tr>
<th>Interface</th>
<td>YES</td>
<td>YES</td>
<td>NO</td>
<td>YES</td>
</tr>
<tr>
<th>Initializar Block</th>
<td colspan=4>NOT ALLOWED</td>
</tr>
</table>

## Scope of the acess modifire

<table border='1'>
<tr>
<th></th>
<th>Accessibility</th>
<th>Private</th>
<th>Default</th>
<th>Protected</th>
<th>Public</th>
</tr>
<tr>
<th>Same Package</th>
<td>Same Class</td>
<td>YES</td>
<td>YES</td>
<td>YES</td>
<td>YES</td>
</tr>
<tr>
<tr>
<th>Same Package</th>
<td>Without Inheritance</td>
<td>NO</td>
<td>YES</td>
<td>YES</td>
<td>YES</td>
</tr>
<tr>
<th>Same Package</th>
<td>With Inheritance</td>
<td>NO</td>
<td>YES</td>
<td>YES</td>
<td>YES</td>
</tr>
<th>Different Package</th>
<td>Without Inheritance</td>
<td>NO</td>
<td>NO</td>
<td>NO</td>
<td>YES</td>
</tr>
<tr>
<th>Different Package</th>
<td>With Inheritance</td>
<td>NO</td>
<td>NO</td>
<td>YES</td>
<td>YES</td>
</tr>
</table>

## public : This class is Accessibel by any other class.

## defult : This class is only Accessibel in the same Package.

## private : This class/code is Accessibel with in declard Class.

## protected :This class is only Accessibel in same Package and subclass.

# Non-Access Modifire

## final :This class/code cannot be Inherited by other class

## abstract :This class cannot be used to create object,to create object it must be Inherited by some other class.

## static :

#### transient
#### synchronize
#### volatile
