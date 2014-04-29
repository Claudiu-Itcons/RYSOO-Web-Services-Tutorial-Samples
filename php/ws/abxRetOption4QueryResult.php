<?php

class abxRetOption4QueryResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxQFieldList $allFields
   * @access public
   */
  public $allFields;

  /**
   * 
   * @var abxQobjectList $allFieldsByObject
   * @access public
   */
  public $allFieldsByObject;

  /**
   * 
   * @var abxQtemplateList $allFieldsByTemplate
   * @access public
   */
  public $allFieldsByTemplate;

  /**
   * 
   * @var abxQFieldList $commonFields
   * @access public
   */
  public $commonFields;

  /**
   * 
   * @var abxOption4Query $option4Query
   * @access public
   */
  public $option4Query;

  /**
   * 
   * @param int $result
   * @param abxQFieldList $allFields
   * @param abxQobjectList $allFieldsByObject
   * @param abxQtemplateList $allFieldsByTemplate
   * @param abxQFieldList $commonFields
   * @param abxOption4Query $option4Query
   * @access public
   */
  public function __construct($result, $allFields, $allFieldsByObject, $allFieldsByTemplate, $commonFields, $option4Query)
  {
    $this->result = $result;
    $this->allFields = $allFields;
    $this->allFieldsByObject = $allFieldsByObject;
    $this->allFieldsByTemplate = $allFieldsByTemplate;
    $this->commonFields = $commonFields;
    $this->option4Query = $option4Query;
  }

}
