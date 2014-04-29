<?php

class abxRetQueryResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxQexpression $submittedQuery
   * @access public
   */
  public $submittedQuery;

  /**
   * 
   * @var abxResultsList $queryResults
   * @access public
   */
  public $queryResults;

  /**
   * 
   * @var int $queryTotalFound
   * @access public
   */
  public $queryTotalFound;

  /**
   * 
   * @param int $result
   * @param abxQexpression $submittedQuery
   * @param abxResultsList $queryResults
   * @param int $queryTotalFound
   * @access public
   */
  public function __construct($result, $submittedQuery, $queryResults, $queryTotalFound)
  {
    $this->result = $result;
    $this->submittedQuery = $submittedQuery;
    $this->queryResults = $queryResults;
    $this->queryTotalFound = $queryTotalFound;
  }

}
