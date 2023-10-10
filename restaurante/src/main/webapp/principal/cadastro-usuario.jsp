<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<jsp:include page="head.jsp"></jsp:include>


<body>
	<jsp:include page="theme-load.jsp"></jsp:include>

	<!-- Pre-loader end -->
	<div id="pcoded" class="pcoded">
		<div class="pcoded-overlay-box"></div>
		<div class="pcoded-container navbar-wrapper">

			<jsp:include page="navigation-bar2.jsp"></jsp:include>

			<div class="pcoded-main-container">
				<div class="pcoded-wrapper">

					<jsp:include page="navigation-bar1.jsp"></jsp:include>

					<div class="pcoded-content">
						<!-- Page-header start -->
						<jsp:include page="page-header.jsp"></jsp:include>
						<!-- Page-header end -->
						<div class="pcoded-inner-content">
							<!-- Main-body start -->
							<div class="main-body">
								<div class="page-wrapper">
									<!-- Page-body start -->
									<div class="page-body">
										<div class="row">
											<div class="col-sm-12">
												<!-- Basic Form Inputs card start -->
												<div class="card">
													<div class="card-header">
														<h5>Cadastro de Usuário</h5>
													</div>
													<div class="card-block">
														<form class="form-material" action="<%= request.getContextPath() %>/ServletCadastro" method="post">
															<div class="form-group form-default">
																<input type="text" name="id" id="id" readonly="readonly"
																	class="form-control"> <span
																	class="form-bar"></span> <label class="float-label">ID</label>
															</div>
															<div class="form-group form-default">
																<input type="text" name="nome" id="nome" autocomplete="off"
																	class="form-control" required="required"> <span
																	class="form-bar"></span> <label class="float-label">Nome</label>
															</div>
															<div class="form-group form-default">
																<input type="text" name="email" id="email" autocomplete="off"
																	class="form-control" required="required"> <span
																	class="form-bar"></span> <label class="float-label">Email</label>
															</div>
															<div class="form-group form-default">
																<input type="text" name="login" id="login" autocomplete="off"
																	class="form-control" required="required"> <span
																	class="form-bar"></span> <label class="float-label">Login</label>
															</div>
															<div class="form-group form-default">
																<input type="password" name="senha" id="senha" autocomplete="off"
																	class="form-control" required="required"> <span
																	class="form-bar"></span> <label class="float-label">Senha</label>
															</div>
															<button class="btn btn-success waves-effect waves-light">Cadastrar</button>
															<button class="btn btn-primary waves-effect waves-light">Alterar</button>
															<button class="btn btn-info waves-effect waves-light">Listar</button>
															<button class="btn btn-danger waves-effect waves-light">Deletar</button>
														</form>
													</div>
												</div>
											</div>
										</div>
									</div>
									<!-- Page-body end -->
								</div>
								<div id="styleSelector"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="javascript-file.jsp"></jsp:include>
</body>

</html>
