<?php

class GetDataTPFileDetail
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $attachmentId
   * @access public
   */
  public $attachmentId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $attachmentId
   * @access public
   */
  public function __construct($SessionId, $attachmentId)
  {
    $this->SessionId = $SessionId;
    $this->attachmentId = $attachmentId;
  }

}
