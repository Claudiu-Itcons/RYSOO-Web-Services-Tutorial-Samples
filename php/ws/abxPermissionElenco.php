<?php

class abxPermissionElenco
{

  /**
   * 
   * @var abxPermission $lista
   * @access public
   */
  public $lista;

  /**
   * 
   * @param abxPermission $lista
   * @access public
   */
  public function __construct($lista)
  {
    $this->lista = $lista;
  }

}
