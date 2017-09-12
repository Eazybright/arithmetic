<html xmlns=”http://www.w3.org/1999/xhtml” xml:lang=”en” lang=”en” >
 <head>
 <title>Numbers</title>
 <link rel=”stylesheet” type=”text/css” href=”common.css”/>

</head>
<body>

<h2>Testing numbers 1-10</h2>
	<table border="1"/>
	<tr>
	<th>number</th>
	
	<th>prime?</th>
</tr>
	
<?php
//for loop 10 times
for($i =1; $i<=10; $i++){
	if($i % 2==0){
	echo $i." "."is an even number</br>";
}
	else{
		echo $i." "."is an odd number </br>";
	}
	//determine prime numbers between 1-10
switch( $i){
	case 2:
	case 3:
	case 5:
	case 7:
	$prime="yes";
	break;
	default:
	$prime="no";
	break;
}
?>
<tr>
	<td><?php echo $i?></td>
	<td><?php echo $prime?></td>
</tr>
<?php
}
?>
</table>
</body>
</html>