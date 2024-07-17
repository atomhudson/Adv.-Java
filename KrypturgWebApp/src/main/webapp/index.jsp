<!DOCTYPE html>
<html>

<head>
  <title>Krypturg</title>
  <link rel="icon" href="resources/Krypturg-logo.png" />

  <meta name="viewport" content="width=device-width, initial-scale=1">

  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
  <!-- font-awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/js/all.min.js" integrity="sha512-rpLlll167T5LJHwp0waJCh3ZRf7pO6IT1+LZOhAyP6phAirwchClbTZV3iqL3BMrVxIYRbzGTpli4rfxsCK6Vw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
  
  <!-- AOS CSS & Script -->
  <script src="resources/aos/aos.js"></script>
  <link rel="stylesheet" href="resources/aos/aos.css"/>

  <!-- custom css -->
  <link rel="stylesheet" href="resources/custom.css">

  <meta name="author" content="Aditya Zuhaib" />
  <meta name="description" content="This is a website for Computers." />
  <meta name="keywords" content="" />
  <style>
        .leetcode-logo {
            width: 24px; /* Adjust the size as needed */
            height: 24px;
        }
    </style>
</head>

<body>
	
	<% 
		String msg=(String)session.getAttribute("msg");
	 	if(msg!=null){
	%>
			<p class="bg-warning p-2 text-center"> <%= msg %> </p>
	<%	
			session.setAttribute("msg", null);
	 	}
	%>
	
    <nav class="navbar navbar-expand-sm container my-3">
        <a href="index.jsp" class="navbar-brand">
          <img src="resources/icon.png" height="35px" alt="">
          <span>Kryp</span>turg
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#my-navbar">
          <i class="fa-solid fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="my-navbar">
            <ul class="navbar-nav mx-auto p-2">
              <li>
                <a href="index.jsp">Home</a>
              </li>
              <li>
                <a href="user.jsp">User</a>
              </li>
              <li>
                <a href=""  data-toggle="modal" data-target="#AdminLoginModal">Admin</a>
              </li>
              <li>
                <a href=""  data-toggle="modal" data-target="#contactModal">Get In Touch</a>
              </li>
            </ul>
            <a id="call" href="tel:9811XXXXXX"><i class="fa-solid fa-mobile-screen-button"></i> 9811XXXXXX</a>
        </div>
    </nav>
    <section>
      <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img src="resources/mb1.jpg" class="d-block w-100" alt="...">
          </div>
          <div class="carousel-item">
            <img src="resources/ram1.jpg" class="d-block w-100" alt="...">
          </div>
          <div class="carousel-item">
            <img src="resources/fan.jpg" class="d-block w-100" alt="...">
          </div>
        </div>
       <button class="carousel-control-prev" type="button" data-target="#carouselExampleControls" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-target="#carouselExampleControls" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </button>
      </div>
    </section>
    <section class="container text-center my-5" id="dishes" data-aos="zoom-in" data-aos-duration="1000">
        <h3>India's first dedicated online store for computer components.</h3>
        <div class="row">
          <div class="col-sm p-2">
            <div class="c-dishes-card">
                <img src="resources/w300.png" alt="">
                <h6>ASUS ROG Strix Z490-E Gaming</h6>
                <p><strong>Socket:</strong> LGA 1200</p>
        		<p><strong>Chipset:</strong> Intel Z490</p>
        		<p><strong>Form Factor:</strong> ATX</p>
		        <p><strong>Memory Support:</strong> 4 x DIMM, max 128GB, DDR4</p>
        		<p><strong>Expansion Slots:</strong> 2 x PCIe 3.0 x16, 3 x PCIe 3.0 x1</p>
        		<p class="price">&#8377; 23,500/-</p>
        		<br><br><br><br><br><br><br><br><br>
            </div>
          </div>
          <div class="col-sm p-2">
            <div class="c-dishes-card">
                <img src="resources/shopping.webp" alt="">
                <h3>ChillBreeze</h3>
  				<p><strong>Description:</strong> The ArcticBlade Pro is the pinnacle of cooling technology. With its sleek design and powerful airflow.</p>
  				<p><strong>Key Features:</strong></p>
  				<ul>
    				<li>Advanced blade technology for whisper-quiet operation.</li>
    				<li>High airflow capacity for efficient cooling.</li>
    				<li>Sleek and modern design to complement any space.</li>
    				<li>Adjustable speed settings for customizable comfort.</li>
    				<li>Energy-efficient motor for cost-effective cooling.</li>
  				</ul>
  				<p><strong>Price:</strong> &#8377; 1500/-</p>
  				<p></p>
  				<br>
            </div>
          </div>
          <div class="col-sm p-2">
            <div class="c-dishes-card">
                <img src="resources/ram.jpg" alt="">
                <h2>Gigastone White RGB Game PRO Desktop RAM</h2>
                <p><strong>Key Features:</strong></p>
				<p><strong>Description:</strong> 16GB (2x8GB) DDR4 16GB DDR4-3200MHz PC4-25600 CL16 1.35V 288 Pin Unbuffered Non ECC UDIMM for PC Gaming Desktop Memory Module</p>
				<p><strong>Capacity:</strong> 16GB (2 x 8GB Module)</p>
				<p><strong>Type:</strong> DDR4 UDIMM Memory RAM</p>
				<p><strong>Speed & Spec:</strong> DDR4 3200MHz (PC4-25600), ECC type: Non ECC, Unbuffered DIMM, Voltage: 1.35V</p>
				<p><strong>Price:</strong> &#8377; 4500/-</p>
            </div>
          </div>
          <div class="col-sm p-2">
            <div class="c-dishes-card">
                <img src="resources/7000.jpeg" alt="">
                <h2>Ryzen 7000 Series</h2>
  				<p><strong>Description:</strong> The Ryzen 7000 series processors represent the latest innovation in AMD's CPU technology.</p>
  				<p><strong>Key Features:</strong></p>
  				<ul>
    				<li>Next-generation Zen 4 architecture for improved IPC and performance.</li>
    				<li>Enhanced 3D V-Cache technology for increased cache capacity and faster data access.</li>
    				<li>DDR5 memory support for higher bandwidth and lower latency.</li>
    				<li>PCIe 5.0 support for faster data transfer rates and improved connectivity.</li>
  				</ul>
  				<p><strong>Price:</strong> &#8377; 10,500/-</p>
            </div>
          </div>
        </div>
        <button class="btn btn-primary my-5 c-get-in-touch" data-toggle="modal" data-target="#contactModal">Get In Touch <i class="fa-solid fa-right-long"></i></button>
    </section>
    <section id="sec-1" class="p-5">
    <p>Welcome to our Computer Parts & Accessories Store!</p>
    <h6>We offer a wide range of high-quality products to enhance your computing experience.</h6>
    <div class="my-4" data-aos="fade-down" data-aos-duration="1000">
        <p>
            <i class="fa-solid fa-computer fa-2x"></i><br/>
            <label>Powerful CPUs and <br> 
            Processors for seamless
            <br>performance.</label>
        </p>
        <p>
            <i class="fa-solid fa-computer-mouse fa-2x"></i><br/>
            <label>Ergonomic mice for precise 
            <br> control and comfort during 
            <br>long hours of usage.</label>
        </p>
        <p class="border-0">
            <i class="fa-solid fa-computer fa-2x"></i><br/>
            <label>High-speed RAM modules
            <br> to boost your system's 
            <br>multitasking capabilities.</label>
        </p>
    </div>
    <button data-aos="fade-right" data-aos-duration="1000" class="btn btn-primary c-get-in-touch" data-toggle="modal" data-target="#contactModal">Get In Touch <i class="fa-solid fa-right-long"></i></button>
</section>

    <footer class="bg-dark p-5 text-center">
        <a href="index.jsp">
          <img src="resources/icon.png" height="35px" alt="">
          <span class="text-danger">Kryp</span>Turg
        </a>
        <br/>
        <p>&copy Rights Reserved</p>
        <p>
          <a href="https://www.facebook.com/prashant.saini.75436?mibextid=ZbWKwL"><i class="fa-brands fa-facebook"></i></a>
          <a href="https://www.linkedin.com/in/prashantsaini0909/"><i class="fa-brands fa-linkedin"></i></a>
          <a href="https://www.github.com/atomhudson"><i class="fa-brands fa-github"></i></a>
          <a href="https://www.leetcode.com/u/dhruv_04" target="_blank" title="LeetCode Profile">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" class="leetcode-logo">
            <path fill="#B3B1B0" d="M22 14.355c0-.742-.564-1.346-1.26-1.346H10.676c-.696 0-1.26.604-1.26 1.346s.563 1.346 1.26 1.346H20.74c.696.001 1.26-.603 1.26-1.346z"></path>
            <path fill="#E7A41F" d="m3.482 18.187 4.313 4.361c.973.979 2.318 1.452 3.803 1.452 1.485 0 2.83-.512 3.805-1.494l2.588-2.637c.51-.514.492-1.365-.039-1.9-.531-.535-1.375-.553-1.884-.039l-2.676 2.607c-.462.467-1.102.662-1.809.662s-1.346-.195-1.81-.662l-4.298-4.363c-.463-.467-.696-1.15-.696-1.863 0-.713.233-1.357.696-1.824l4.285-4.38c.463-.467 1.116-.645 1.822-.645s1.346.195 1.809.662l2.676 2.606c.51.515 1.354.497 1.885-.038.531-.536.549-1.387.039-1.901l-2.588-2.636a4.994 4.994 0 0 0-2.392-1.33l-.034-.007 2.447-2.503c.512-.514.494-1.366-.037-1.901-.531-.535-1.376-.552-1.887-.038l-10.018 10.1C2.509 11.458 2 12.813 2 14.311c0 1.498.509 2.896 1.482 3.876z"></path>
            <path fill="#070706" d="M8.115 22.814a2.109 2.109 0 0 1-.474-.361c-1.327-1.333-2.66-2.66-3.984-3.997-1.989-2.008-2.302-4.937-.786-7.32a6 6 0 0 1 .839-1.004L13.333.489c.625-.626 1.498-.652 2.079-.067.56.563.527 1.455-.078 2.066-.769.776-1.539 1.55-2.309 2.325-.041.122-.14.2-.225.287-.863.876-1.75 1.729-2.601 2.618-.111.116-.262.186-.372.305-1.423 1.423-2.863 2.83-4.266 4.272-1.135 1.167-1.097 2.938.068 4.127 1.308 1.336 2.639 2.65 3.961 3.974.067.067.136.132.204.198.468.303.474 1.25.183 1.671-.321.465-.74.75-1.333.728-.199-.006-.363-.086-.529-.179z"></path>
        </svg>
    </a>
        </p>
    </footer>
    <label id="top-button"><i class="fa-solid fa-circle-up fa-2x"></i></label>

	<!-- Modal -->
    <div class="modal fade" id="AdminLoginModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header bg-primary text-white">
            <h5 class="modal-title" id="exampleModalLabel">Admin Login</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
              <form action="AdminLogin" method="post" >
                  <div class="row">
                      <div class="col-sm mt-2">
                          <input class="form-control" type="text" name="id" maxlength="20" placeholder="Admin ID" required />
                      </div>
                      <div class="col-sm mt-2">
                        <input class="form-control" type="password" name="password" maxlength="20" placeholder="Password" required />
                    </div>
                    <div class="col-sm mt-2">
                      <button class="btn btn-primary">Login</button>
                    </div>
                  </div>
              </form>
          </div>
        </div>
      </div>
    </div>
    <!-- Modal -->
    <div class="modal fade" id="contactModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header bg-success">
            <h5 class="modal-title" id="exampleModalLabel">Get In Touch</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
              <form action="AddEnquiry" method="post">
                  <div class="row">
                      <div class="col-sm mt-2">
                          <input class="form-control" type="text" name="name" pattern="[a-zA-Z ]+" maxlength="20" placeholder="Your Name" required />
                      </div>
                      <div class="col-sm mt-2">
                        <input class="form-control" type="tel" name="phone" pattern="[0-9]+" maxlength="10" minlength="10" placeholder="Your Phone" required />
                    </div>
                    <div class="col-sm mt-2">
                      <button class="btn btn-success">Submit</button>
                    </div>
                  </div>
              </form>
          </div>
        </div>
      </div>
    </div>
</body>
<script>
    AOS.init();
    //script for scroll to top
    $("#top-button").click(function () {
        $("html, body").animate({scrollTop: 0}, 1000);
    });
</script>
</html>