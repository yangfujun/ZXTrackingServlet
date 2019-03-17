<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="navgation.html" />
<script
src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDJW4jsPlNKgv6jFm3B5Edp5ywgdqLWdmc&sensor=false">
</script>

<script>

var myCenter=new google.maps.LatLng(42.994880,-81.212140);
var marker;

function initialize()
{
var mapProp = {
  center:myCenter,
  zoom:13,
  mapTypeId:google.maps.MapTypeId.ROADMAP
  };

var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

	marker=new google.maps.Marker({
  position:myCenter,
  animation:google.maps.Animation.BOUNCE
  });

marker.setMap(map);
}

google.maps.event.addDomListener(window, 'load', initialize);
</script>
</script>
</head>
<body>
<div style="clear: both;">
	<div class="container-fluid">
		<p style="margin-left: 10%;width:530px;height:380px;display: inline-block; font-size: 26px;"><font color="red">Z&X Auto Parts and Service Inc.</font> is an North American automotive parts distribution network that is currently owned and operated by Advance Auto Parts via independent retailers associated with the network. As of October 4, 2018 Advance owned around 30 employees,  over 3100 distributors. Z&X Auto Parts has its own management system and dispatch system, in a leading position in western Ontario.</p>
		<div id="googleMap" style="width:530px;height:380px;display: inline-block; "></div>
	</div>
	
</div>


</body>
</html>