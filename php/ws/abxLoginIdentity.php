<?php

class abxLoginIdentity
{

  /**
   * 
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @var string $password
   * @access public
   */
  public $password;

  /**
   * 
   * @var string $passphrase
   * @access public
   */
  public $passphrase;

  /**
   * 
   * @var string $domain
   * @access public
   */
  public $domain;

  /**
   * 
   * @var string $archiboxIP
   * @access public
   */
  public $archiboxIP;

  /**
   * 
   * @var string $languageID
   * @access public
   */
  public $languageID;

  /**
   * 
   * @var int $sourceID
   * @access public
   */
  public $sourceID;

  /**
   * 
   * @var boolean $usernameLogin
   * @access public
   */
  public $usernameLogin;

  /**
   * 
   * @param string $username
   * @param string $password
   * @param string $passphrase
   * @param string $domain
   * @param string $archiboxIP
   * @param string $languageID
   * @param int $sourceID
   * @param boolean $usernameLogin
   * @access public
   */
  public function __construct($username, $password, $passphrase, $domain, $archiboxIP, $languageID, $sourceID, $usernameLogin)
  {
    $this->username = $username;
    $this->password = $password;
    $this->passphrase = $passphrase;
    $this->domain = $domain;
    $this->archiboxIP = $archiboxIP;
    $this->languageID = $languageID;
    $this->sourceID = $sourceID;
    $this->usernameLogin = $usernameLogin;
  }

}
