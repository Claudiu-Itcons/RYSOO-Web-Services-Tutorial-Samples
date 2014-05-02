<?php

class AbxWsdlResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var string $WARNINGvalue
   * @access public
   */
  public $WARNINGvalue;

  /**
   * 
   * @var string $ERRORvalue
   * @access public
   */
  public $ERRORvalue;

  /**
   * 
   * @param int $result
   * @param string $WARNINGvalue
   * @param string $ERRORvalue
   * @access public
   */
  public function __construct($result, $WARNINGvalue, $ERRORvalue)
  {
    $this->result = $result;
    $this->WARNINGvalue = $WARNINGvalue;
    $this->ERRORvalue = $ERRORvalue;
  }

}
