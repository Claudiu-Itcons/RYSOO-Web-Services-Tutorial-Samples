<?php

class abxClasseDocumentaleResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxClasseDocumentaleList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxClasseDocumentaleList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
