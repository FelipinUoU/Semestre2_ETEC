<?php

namespace App\Persistence;

class ConnectionFactory{

    private $_conn;

    public function getInstance()
    {
        try
        {
            if(!isset($this->_conn)){
                $this->_conn = 
                  new \PDO("mysql:host=localhost;dbname=etec","root","");
                  return $this->_conn;
            }else{
                return $this->_conn;
            }
        }catch(\PDOException $e){
            $e->getMessage();
        }
    }


}