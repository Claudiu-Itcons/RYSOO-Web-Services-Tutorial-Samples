<?php

class abxSchedulerTask
{

  /**
   * 
   * @var abxSchedule $abxSchedule
   * @access public
   */
  public $abxSchedule;

  /**
   * 
   * @var string $name
   * @access public
   */
  public $name;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @var string $type
   * @access public
   */
  public $type;

  /**
   * 
   * @var string $configXML
   * @access public
   */
  public $configXML;

  /**
   * 
   * @var string $id
   * @access public
   */
  public $id;

  /**
   * 
   * @var string $appTaskId
   * @access public
   */
  public $appTaskId;

  /**
   * 
   * @param abxSchedule $abxSchedule
   * @param string $name
   * @param string $description
   * @param string $type
   * @param string $configXML
   * @param string $id
   * @param string $appTaskId
   * @access public
   */
  public function __construct($abxSchedule, $name, $description, $type, $configXML, $id, $appTaskId)
  {
    $this->abxSchedule = $abxSchedule;
    $this->name = $name;
    $this->description = $description;
    $this->type = $type;
    $this->configXML = $configXML;
    $this->id = $id;
    $this->appTaskId = $appTaskId;
  }

}
