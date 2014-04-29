<?php

class SetTmpWFUploadPath
{

  /**
   * 
   * @var string $path
   * @access public
   */
  public $path;

  /**
   * 
   * @param string $path
   * @access public
   */
  public function __construct($path)
  {
    $this->path = $path;
  }

}
