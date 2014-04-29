<?php

class filters
{

  /**
   * 
   * @var string $serverId
   * @access public
   */
  public $serverId;

  /**
   * 
   * @var string $dateFrom
   * @access public
   */
  public $dateFrom;

  /**
   * 
   * @var string $dateTo
   * @access public
   */
  public $dateTo;

  /**
   * 
   * @var string $numberFrom
   * @access public
   */
  public $numberFrom;

  /**
   * 
   * @var string $numberTo
   * @access public
   */
  public $numberTo;

  /**
   * 
   * @var string $protocolId
   * @access public
   */
  public $protocolId;

  /**
   * 
   * @param string $serverId
   * @param string $dateFrom
   * @param string $dateTo
   * @param string $numberFrom
   * @param string $numberTo
   * @param string $protocolId
   * @access public
   */
  public function __construct($serverId, $dateFrom, $dateTo, $numberFrom, $numberTo, $protocolId)
  {
    $this->serverId = $serverId;
    $this->dateFrom = $dateFrom;
    $this->dateTo = $dateTo;
    $this->numberFrom = $numberFrom;
    $this->numberTo = $numberTo;
    $this->protocolId = $protocolId;
  }

}
