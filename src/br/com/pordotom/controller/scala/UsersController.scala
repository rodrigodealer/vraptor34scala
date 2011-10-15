package br.com.pordotom.controller.scala

import br.com.caelum.vraptor.{Result, Path, Get, Resource}

/**
 * Created by IntelliJ IDEA.
 * User: rodrigo
 * Date: 10/11/11
 * Time: 9:13 AM
 * To change this template use File | Settings | File Templates.
 */

@Resource
class UsersController(result:Result) {

  @Get
  @Path(Array("/users"))
  def index {
    result.include("mensagem", "Alguma mensagem");
  }

}