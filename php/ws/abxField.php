<?php

class abxField
{

  /**
   * 
   * @var string $name
   * @access public
   */
  public $name;

  /**
   * 
   * @var string $defaultLanguage
   * @access public
   */
  public $defaultLanguage;

  /**
   * 
   * @var string $Description
   * @access public
   */
  public $Description;

  /**
   * 
   * @var allDescription $allDescription
   * @access public
   */
  public $allDescription;

  /**
   * 
   * @var string $type
   * @access public
   */
  public $type;

  /**
   * 
   * @var string $lenght
   * @access public
   */
  public $lenght;

  /**
   * 
   * @var string $precision
   * @access public
   */
  public $precision;

  /**
   * 
   * @var string $option
   * @access public
   */
  public $option;

  /**
   * 
   * @var string $OptionDescription
   * @access public
   */
  public $OptionDescription;

  /**
   * 
   * @var allOptionDescription $allOptionDescription
   * @access public
   */
  public $allOptionDescription;

  /**
   * 
   * @var extended $extended
   * @access public
   */
  public $extended;

  /**
   * 
   * @var boolean $obbligatorio
   * @access public
   */
  public $obbligatorio;

  /**
   * 
   * @var boolean $nascosto
   * @access public
   */
  public $nascosto;

  /**
   * 
   * @var boolean $univoco
   * @access public
   */
  public $univoco;

  /**
   * 
   * @var boolean $filter
   * @access public
   */
  public $filter;

  /**
   * 
   * @var boolean $filterinterval
   * @access public
   */
  public $filterinterval;

  /**
   * 
   * @var boolean $vistaview
   * @access public
   */
  public $vistaview;

  /**
   * 
   * @var boolean $showInWorkList
   * @access public
   */
  public $showInWorkList;

  /**
   * 
   * @var int $displayindex
   * @access public
   */
  public $displayindex;

  /**
   * 
   * @var abxPermission $permission
   * @access public
   */
  public $permission;

  /**
   * 
   * @param string $name
   * @param string $defaultLanguage
   * @param string $Description
   * @param allDescription $allDescription
   * @param string $type
   * @param string $lenght
   * @param string $precision
   * @param string $option
   * @param string $OptionDescription
   * @param allOptionDescription $allOptionDescription
   * @param extended $extended
   * @param boolean $obbligatorio
   * @param boolean $nascosto
   * @param boolean $univoco
   * @param boolean $filter
   * @param boolean $filterinterval
   * @param boolean $vistaview
   * @param boolean $showInWorkList
   * @param int $displayindex
   * @param abxPermission $permission
   * @access public
   */
  public function __construct($name, $defaultLanguage, $Description, $allDescription, $type, $lenght, $precision, $option, $OptionDescription, $allOptionDescription, $extended, $obbligatorio, $nascosto, $univoco, $filter, $filterinterval, $vistaview, $showInWorkList, $displayindex, $permission)
  {
    $this->name = $name;
    $this->defaultLanguage = $defaultLanguage;
    $this->Description = $Description;
    $this->allDescription = $allDescription;
    $this->type = $type;
    $this->lenght = $lenght;
    $this->precision = $precision;
    $this->option = $option;
    $this->OptionDescription = $OptionDescription;
    $this->allOptionDescription = $allOptionDescription;
    $this->extended = $extended;
    $this->obbligatorio = $obbligatorio;
    $this->nascosto = $nascosto;
    $this->univoco = $univoco;
    $this->filter = $filter;
    $this->filterinterval = $filterinterval;
    $this->vistaview = $vistaview;
    $this->showInWorkList = $showInWorkList;
    $this->displayindex = $displayindex;
    $this->permission = $permission;
  }

}
