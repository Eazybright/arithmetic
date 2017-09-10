<!DOCTYPE html PUBLIC “-//W3C//DTD XHTML 1.0 Strict//EN”
 “http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd”>
<html xmlns=”http://www.w3.org/1999/xhtml” xml:lang=”en” lang=”en”>
 <head>
 <title>Hello</title>
 <link rel=”stylesheet” type=”text/css” href=”common.css” />
 </head>
 <body>
 <h1><?php
 //get the correct time and date format
 $curretTime=date("g:i:s a");
 $currentDate=date("j-M-Y");
 //display the result
 echo "Hello, World!</br> The currrent time and date is </br>$curretTime </br>$currentDate";?></h1>
 </body>
</html>