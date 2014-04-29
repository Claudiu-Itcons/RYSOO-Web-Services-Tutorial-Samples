<?php

class abxClasseDocumentale
{

  /**
   * 
   * @var Metadata $Metadata
   * @access public
   */
  public $Metadata;

  /**
   * 
   * @var string $name
   * @access public
   */
  public $name;

  /**
   * 
   * @var string $company
   * @access public
   */
  public $company;

  /**
   * 
   * @var int $preserveMaxAge
   * @access public
   */
  public $preserveMaxAge;

  /**
   * 
   * @var int $preserveNumDays
   * @access public
   */
  public $preserveNumDays;

  /**
   * 
   * @var boolean $automaticallySigned
   * @access public
   */
  public $automaticallySigned;

  /**
   * 
   * @var boolean $automaticallyTimestamped
   * @access public
   */
  public $automaticallyTimestamped;

  /**
   * 
   * @var boolean $makeISO
   * @access public
   */
  public $makeISO;

  /**
   * 
   * @param Metadata $Metadata
   * @param string $name
   * @param string $company
   * @param int $preserveMaxAge
   * @param int $preserveNumDays
   * @param boolean $automaticallySigned
   * @param boolean $automaticallyTimestamped
   * @param boolean $makeISO
   * @access public
   */
  public function __construct($Metadata, $name, $company, $preserveMaxAge, $preserveNumDays, $automaticallySigned, $automaticallyTimestamped, $makeISO)
  {
    $this->Metadata = $Metadata;
    $this->name = $name;
    $this->company = $company;
    $this->preserveMaxAge = $preserveMaxAge;
    $this->preserveNumDays = $preserveNumDays;
    $this->automaticallySigned = $automaticallySigned;
    $this->automaticallyTimestamped = $automaticallyTimestamped;
    $this->makeISO = $makeISO;
  }

}
