<?php

class abxSDKWatchFolderDirectoryList
{

  /**
   * 
   * @var abxSDKWatchFolderDirectory $directories
   * @access public
   */
  public $directories;

  /**
   * 
   * @param abxSDKWatchFolderDirectory $directories
   * @access public
   */
  public function __construct($directories)
  {
    $this->directories = $directories;
  }

}
