package br.com.pordotom.controller.scala

import br.com.caelum.vraptor.{Path, Get, Resource}

/**
 * Created by IntelliJ IDEA.
 * User: rodrigo
 * Date: 10/11/11
 * Time: 9:26 AM
 * To change this template use File | Settings | File Templates.
 */

@Resource
class HomeController {

  @Get
  @Path(Array("/"))
  def index {

  }
}