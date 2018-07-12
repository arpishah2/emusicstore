<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<%@ page contentType="text/html;charset=UTF-8" language="java"%>

	<div class="container-wrapper">
		<div class="container">
			<div class="page-header">
				<h1>Product Details</h1>
				<p class="lead">Here is the detailed information of the product</p>
			</div>
			
			<div class="container">
				<div class="row">
					<div class="col-ad-5">
						<img src="#" alt="image" style="width:100% height=300px" />
					
				
						<div class="col-ad-5">
							<h3>${product.productName}</h3>
							<p>${product.productDescription}</p>
							<p><strong>Manufacturer</strong> : ${product.productManufacturer}</p>
							<p><strong>Category</strong> : ${product.productCategory}</p>
							<p><strong>Condition</strong>: ${product.productCondition}</p>
							<p><strong>Price</strong>: ${product.productPrice}</p>							
						</div>
						
						</div>
				
			</div>

			<%@ include file="/WEB-INF/views/template/footer.jsp" %>