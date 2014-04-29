<?php

class abxDomain
{

  /**
   * 
   * @var string $domain_hash
   * @access public
   */
  public $domain_hash;

  /**
   * 
   * @var string $domain_name
   * @access public
   */
  public $domain_name;

  /**
   * 
   * @param string $domain_hash
   * @param string $domain_name
   * @access public
   */
  public function __construct($domain_hash, $domain_name)
  {
    $this->domain_hash = $domain_hash;
    $this->domain_name = $domain_name;
  }

}
