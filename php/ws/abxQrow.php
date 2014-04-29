<?php

class abxQrow
{

  /**
   * 
   * @var abxPermission $rP
   * @access public
   */
  public $rP;

  /**
   * 
   * @var string $c
   * @access public
   */
  public $c;

  /**
   * 
   * @var string $DataID
   * @access public
   */
  public $DataID;

  /**
   * 
   * @var string $totAttach
   * @access public
   */
  public $totAttach;

  /**
   * 
   * @var abxProtocolUse $protocol
   * @access public
   */
  public $protocol;

  /**
   * 
   * @param abxPermission $rP
   * @param string $c
   * @param string $DataID
   * @param string $totAttach
   * @param abxProtocolUse $protocol
   * @access public
   */
  public function __construct($rP, $c, $DataID, $totAttach, $protocol)
  {
    $this->rP = $rP;
    $this->c = $c;
    $this->DataID = $DataID;
    $this->totAttach = $totAttach;
    $this->protocol = $protocol;
  }

}
