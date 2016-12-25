<%@ include file="/WEB-INF/views/template/header.jsp" %>

<!-- Carousel
================================================== -->

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
	  <li data-target="#myCarousel" data-slide-to="3"></li>
	  <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/Images/2017_porsche_panamera_4_e_hybrid_rear-1280x720.jpg" alt="Camera" width="1200" height="700">
        <div class="carousel-caption">
          <h3></h3>
          <p></p>
        </div>
      </div>

      <div class="item">
        <img src="resources/Images/2016_dodge_shakedown_challenger-1280x720.jpg" alt="Camera" width="1200" height="700">
        <div class="carousel-caption">
          <h3></h3>
          <p></p>
        </div>
      </div>
    
      <div class="item">
        <img src="resources/Images/2016_vorsteiner_lamborghini_aventador_zaragoza_edizione_2-1280x720.jpg" alt="Camera" width="1200" height="700">
        <div class="carousel-caption">
          <h3></h3>
          <p></p>
        </div>
      </div>

	  <div class="item">
        <img src="resources/Images/2016_vorsteiner_mclaren_570_vx-1280x720.jpg" alt="Camera" width="1200" height="700">
        <div class="carousel-caption">
          <h3></h3>
          <p></p>
        </div>
     
	 </div>
	    <div class="item">
        <img src="resources/Images/2017_nissan_rogue_2-1280x720.jpg" alt="Camera" width="1200" height="700">
        <div class="carousel-caption">
          <h3></h3>
          <p></p>
        </div>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>