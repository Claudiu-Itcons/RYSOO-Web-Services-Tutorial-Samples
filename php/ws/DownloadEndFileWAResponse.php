<?php

class DownloadEndFileWAResponse
{

  /**
   * 
   * @var abxFileResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxFileResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
