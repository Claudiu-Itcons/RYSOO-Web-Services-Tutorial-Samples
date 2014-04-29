<?php

class abxSDKWatchFolderDirectory
{

  /**
   * 
   * @var string $directoryName
   * @access public
   */
  public $directoryName;

  /**
   * 
   * @param string $directoryName
   * @access public
   */
  public function __construct($directoryName)
  {
    $this->directoryName = $directoryName;
  }

}
