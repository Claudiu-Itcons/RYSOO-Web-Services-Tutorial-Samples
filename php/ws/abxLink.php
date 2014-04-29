<?php

class abxLink
{

  /**
   * 
   * @var string $fromTable
   * @access public
   */
  public $fromTable;

  /**
   * 
   * @var string $toTable
   * @access public
   */
  public $toTable;

  /**
   * 
   * @var string $fromTableId
   * @access public
   */
  public $fromTableId;

  /**
   * 
   * @var string $toTableId
   * @access public
   */
  public $toTableId;

  /**
   * 
   * @var int $countLinks
   * @access public
   */
  public $countLinks;

  /**
   * 
   * @var string $fromInstanceName
   * @access public
   */
  public $fromInstanceName;

  /**
   * 
   * @var string $toInstanceName
   * @access public
   */
  public $toInstanceName;

  /**
   * 
   * @var string $note
   * @access public
   */
  public $note;

  /**
   * 
   * @var string $linkId
   * @access public
   */
  public $linkId;

  /**
   * 
   * @param string $fromTable
   * @param string $toTable
   * @param string $fromTableId
   * @param string $toTableId
   * @param int $countLinks
   * @param string $fromInstanceName
   * @param string $toInstanceName
   * @param string $note
   * @param string $linkId
   * @access public
   */
  public function __construct($fromTable, $toTable, $fromTableId, $toTableId, $countLinks, $fromInstanceName, $toInstanceName, $note, $linkId)
  {
    $this->fromTable = $fromTable;
    $this->toTable = $toTable;
    $this->fromTableId = $fromTableId;
    $this->toTableId = $toTableId;
    $this->countLinks = $countLinks;
    $this->fromInstanceName = $fromInstanceName;
    $this->toInstanceName = $toInstanceName;
    $this->note = $note;
    $this->linkId = $linkId;
  }

}
