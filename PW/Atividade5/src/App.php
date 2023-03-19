<?php 

include_once(__DIR__.'/../vendor/autoload.php');

use App\Model\Pessoa;
use App\Persistence\ConnectionFactory;

$p = new Pessoa();

$p->nome = "Felipin Foda";
echo $p->nome;

$connectionFactory = new ConnectionFactory();
$conn = $connectionFactory->getInstance(); 
var_dump($conn);

$sql = "insert into alunos (nome, telefone) values ('Felipe Triste','13216')";
    echo $sql;
    $query = $conn->prepare($sql); 
    $query ->execute();