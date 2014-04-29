<?php

class abxArchiBoxInDomain
{

  /**
   * 
   * @var int $abxId
   * @access public
   */
  public $abxId;

  /**
   * 
   * @var int $domainId
   * @access public
   */
  public $domainId;

  /**
   * 
   * @var string $matricola
   * @access public
   */
  public $matricola;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @var string $ipAddress
   * @access public
   */
  public $ipAddress;

  /**
   * 
   * @var string $location
   * @access public
   */
  public $location;

  /**
   * 
   * @var string $release
   * @access public
   */
  public $release;

  /**
   * 
   * @var int $serverId
   * @access public
   */
  public $serverId;

  /**
   * 
   * @var string $status
   * @access public
   */
  public $status;

  /**
   * 
   * @var int $requestId
   * @access public
   */
  public $requestId;

  /**
   * 
   * @param int $abxId
   * @param int $domainId
   * @param string $matricola
   * @param string $description
   * @param string $ipAddress
   * @param string $location
   * @param string $release
   * @param int $serverId
   * @param string $status
   * @param int $requestId
   * @access public
   */
  public function __construct($abxId, $domainId, $matricola, $description, $ipAddress, $location, $release, $serverId, $status, $requestId)
  {
    $this->abxId = $abxId;
    $this->domainId = $domainId;
    $this->matricola = $matricola;
    $this->description = $description;
    $this->ipAddress = $ipAddress;
    $this->location = $location;
    $this->release = $release;
    $this->serverId = $serverId;
    $this->status = $status;
    $this->requestId = $requestId;
  }

}
