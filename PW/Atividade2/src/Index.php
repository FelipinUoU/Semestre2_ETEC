<?php

require '../vendor/autoload.php';

use Monolog\Formatter\LogglyFormatter;
use Monolog\Logger;
use Monolog\Handler\StreamHandler;

$logger = new Logger('NomeDoCanal');
$logger->pushHandler(new StreamHandler(__DIR__.'/App.log', Logger::DEBUG));

$logger->info('Este e uma strimg de info');
$logger->warning('Isso e um aviso cara...');
$logger->error('TA TODO ERRADO CARA');

$variable = array(1,17,"Hellow Word",null);
var_dump ($variable);

