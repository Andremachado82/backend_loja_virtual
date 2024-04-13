select constraint_name
from information_schema.constraint_column_usage
where table_name = 'usuario_acesso'
and column_name = 'acesso_id'
and constraint_name <> 'acesso_unico_usuario';

alter table usuario_acesso drop CONSTRAINT "uk_fhwpg5wu1u5p306q8gycxn9ky";