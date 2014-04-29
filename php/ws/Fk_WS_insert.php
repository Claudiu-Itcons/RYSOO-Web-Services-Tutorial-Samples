<?php

class Fk_WS_insert
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $fieldName
   * @access public
   */
  public $fieldName;

  /**
   * 
   * @var string $fkName
   * @access public
   */
  public $fkName;

  /**
   * 
   * @var string $wsdlUrl
   * @access public
   */
  public $wsdlUrl;

  /**
   * 
   * @var string $user
   * @access public
   */
  public $user;

  /**
   * 
   * @var string $pwd
   * @access public
   */
  public $pwd;

  /**
   * 
   * @var boolean $optionGetCache
   * @access public
   */
  public $optionGetCache;

  /**
   * 
   * @var boolean $optionSetDesc
   * @access public
   */
  public $optionSetDesc;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $fieldName
   * @param string $fkName
   * @param string $wsdlUrl
   * @param string $user
   * @param string $pwd
   * @param boolean $optionGetCache
   * @param boolean $optionSetDesc
   * @access public
   */
  public function __construct($SessionId, $fieldName, $fkName, $wsdlUrl, $user, $pwd, $optionGetCache, $optionSetDesc)
  {
    $this->SessionId = $SessionId;
    $this->fieldName = $fieldName;
    $this->fkName = $fkName;
    $this->wsdlUrl = $wsdlUrl;
    $this->user = $user;
    $this->pwd = $pwd;
    $this->optionGetCache = $optionGetCache;
    $this->optionSetDesc = $optionSetDesc;
  }

}
