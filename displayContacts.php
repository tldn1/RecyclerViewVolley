<?php
	error_reporting(0);
	require "init.php";
	
	$query = "SELECT * FROM contact_info";
	$result = mysqli_query($con,$query);
	$response = array();
	
	while($row = mysqli_fetch_array($result)){
		array_push($response,array('name'=>$row[0],'email'=>$row[1]));
	}

	mysqli_close($con);
	
	echo json_encode($response);
	
?>