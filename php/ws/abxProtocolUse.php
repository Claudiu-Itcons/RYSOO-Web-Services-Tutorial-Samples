<?php

class abxProtocolUse
{

  /**
   * 
   * @var string $serverId
   * @access public
   */
  public $serverId;

  /**
   * 
   * @var string $protocolId
   * @access public
   */
  public $protocolId;

  /**
   * 
   * @var string $protocolName
   * @access public
   */
  public $protocolName;

  /**
   * 
   * @var string $date
   * @access public
   */
  public $date;

  /**
   * 
   * @var string $number
   * @access public
   */
  public $number;

  /**
   * 
   * @var string $resultFormatted
   * @access public
   */
  public $resultFormatted;

  /**
   * 
   * @var filters $filters
   * @access public
   */
  public $filters;

  /**
   * 
   * @param string $serverId
   * @param string $protocolId
   * @param string $protocolName
   * @param string $date
   * @param string $number
   * @param string $resultFormatted
   * @param filters $filters
   * @access public
   */
  public function __construct($serverId, $protocolId, $protocolName, $date, $number, $resultFormatted, $filters)
  {
    $this->serverId = $serverId;
    $this->protocolId = $protocolId;
    $this->protocolName = $protocolName;
    $this->date = $date;
    $this->number = $number;
    $this->resultFormatted = $resultFormatted;
    $this->filters = $filters;
  }

}
