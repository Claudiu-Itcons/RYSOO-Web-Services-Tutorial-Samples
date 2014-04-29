<?php

class userSettings
{

  /**
   * 
   * @var string $userName
   * @access public
   */
  public $userName;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $worklistFields
   * @access public
   */
  public $worklistFields;

  /**
   * 
   * @param string $userName
   * @param string $instanceName
   * @param string $worklistFields
   * @access public
   */
  public function __construct($userName, $instanceName, $worklistFields)
  {
    $this->userName = $userName;
    $this->instanceName = $instanceName;
    $this->worklistFields = $worklistFields;
  }

}
