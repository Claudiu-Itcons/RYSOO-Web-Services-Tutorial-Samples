<?php

class IDtype
{

  /**
   * 
   * @var string $SessionID
   * @access public
   */
  public $SessionID;

  /**
   * 
   * @var string $CryptSessionHash
   * @access public
   */
  public $CryptSessionHash;

  /**
   * 
   * @var boolean $privilegedUser
   * @access public
   */
  public $privilegedUser;

  /**
   * 
   * @param string $SessionID
   * @param string $CryptSessionHash
   * @param boolean $privilegedUser
   * @access public
   */
  public function __construct($SessionID, $CryptSessionHash, $privilegedUser)
  {
    $this->SessionID = $SessionID;
    $this->CryptSessionHash = $CryptSessionHash;
    $this->privilegedUser = $privilegedUser;
  }

}
