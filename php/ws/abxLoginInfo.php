<?php

class abxLoginInfo
{

  /**
   * 
   * @var string $matricola
   * @access public
   */
  public $matricola;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @var string $ipaddress
   * @access public
   */
  public $ipaddress;

  /**
   * 
   * @var string $location
   * @access public
   */
  public $location;

  /**
   * 
   * @var string $release
   * @access public
   */
  public $release;

  /**
   * 
   * @var int $serverid
   * @access public
   */
  public $serverid;

  /**
   * 
   * @var boolean $activeDirectoryEnabled
   * @access public
   */
  public $activeDirectoryEnabled;

  /**
   * 
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @param string $matricola
   * @param string $description
   * @param string $ipaddress
   * @param string $location
   * @param string $release
   * @param int $serverid
   * @param boolean $activeDirectoryEnabled
   * @param string $username
   * @access public
   */
  public function __construct($matricola, $description, $ipaddress, $location, $release, $serverid, $activeDirectoryEnabled, $username)
  {
    $this->matricola = $matricola;
    $this->description = $description;
    $this->ipaddress = $ipaddress;
    $this->location = $location;
    $this->release = $release;
    $this->serverid = $serverid;
    $this->activeDirectoryEnabled = $activeDirectoryEnabled;
    $this->username = $username;
  }

}
