<?php

class abxGroup
{

  /**
   * 
   * @var string $id
   * @access public
   */
  public $id;

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
   * @var abxUserList $userList
   * @access public
   */
  public $userList;

  /**
   * 
   * @var boolean $isSystemGroup
   * @access public
   */
  public $isSystemGroup;

  /**
   * 
   * @param string $id
   * @param string $name
   * @param string $description
   * @param abxUserList $userList
   * @param boolean $isSystemGroup
   * @access public
   */
  public function __construct($id, $name, $description, $userList, $isSystemGroup)
  {
    $this->id = $id;
    $this->name = $name;
    $this->description = $description;
    $this->userList = $userList;
    $this->isSystemGroup = $isSystemGroup;
  }

}
