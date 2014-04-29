<?php

class abxLoginResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var IDtype $sessionIDF
   * @access public
   */
  public $sessionIDF;

  /**
   * 
   * @var abxLoginInfo $loginInfo
   * @access public
   */
  public $loginInfo;

  /**
   * 
   * @param int $result
   * @param IDtype $sessionIDF
   * @param abxLoginInfo $loginInfo
   * @access public
   */
  public function __construct($result, $sessionIDF, $loginInfo)
  {
    $this->result = $result;
    $this->sessionIDF = $sessionIDF;
    $this->loginInfo = $loginInfo;
  }

}
