<?php

class ExtractSDKPDFTemplateTextByArea
{

  /**
   * 
   * @var IDtype $sessionId
   * @access public
   */
  public $sessionId;

  /**
   * 
   * @var string $idTask
   * @access public
   */
  public $idTask;

  /**
   * 
   * @var int $x
   * @access public
   */
  public $x;

  /**
   * 
   * @var int $y
   * @access public
   */
  public $y;

  /**
   * 
   * @var int $width
   * @access public
   */
  public $width;

  /**
   * 
   * @var int $height
   * @access public
   */
  public $height;

  /**
   * 
   * @var int $page
   * @access public
   */
  public $page;

  /**
   * 
   * @param IDtype $sessionId
   * @param string $idTask
   * @param int $x
   * @param int $y
   * @param int $width
   * @param int $height
   * @param int $page
   * @access public
   */
  public function __construct($sessionId, $idTask, $x, $y, $width, $height, $page)
  {
    $this->sessionId = $sessionId;
    $this->idTask = $idTask;
    $this->x = $x;
    $this->y = $y;
    $this->width = $width;
    $this->height = $height;
    $this->page = $page;
  }

}
