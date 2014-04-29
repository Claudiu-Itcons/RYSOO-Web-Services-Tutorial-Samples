<?php

class abxTreeParam
{

  /**
   * 
   * @var int $revisionID
   * @access public
   */
  public $revisionID;

  /**
   * 
   * @var string $treeStartHexInstanceID
   * @access public
   */
  public $treeStartHexInstanceID;

  /**
   * 
   * @var string $treeStartInstancePathname
   * @access public
   */
  public $treeStartInstancePathname;

  /**
   * 
   * @var int $treeDeepLevelNumberDown
   * @access public
   */
  public $treeDeepLevelNumberDown;

  /**
   * 
   * @var int $treeNumberElementsDown
   * @access public
   */
  public $treeNumberElementsDown;

  /**
   * 
   * @var objvect $objvect
   * @access public
   */
  public $objvect;

  /**
   * 
   * @param int $revisionID
   * @param string $treeStartHexInstanceID
   * @param string $treeStartInstancePathname
   * @param int $treeDeepLevelNumberDown
   * @param int $treeNumberElementsDown
   * @param objvect $objvect
   * @access public
   */
  public function __construct($revisionID, $treeStartHexInstanceID, $treeStartInstancePathname, $treeDeepLevelNumberDown, $treeNumberElementsDown, $objvect)
  {
    $this->revisionID = $revisionID;
    $this->treeStartHexInstanceID = $treeStartHexInstanceID;
    $this->treeStartInstancePathname = $treeStartInstancePathname;
    $this->treeDeepLevelNumberDown = $treeDeepLevelNumberDown;
    $this->treeNumberElementsDown = $treeNumberElementsDown;
    $this->objvect = $objvect;
  }

}
