drop table business_way purge;
create table business_way(
  business_id int not null,
  business_name varchar(50) not null,
  business_code varchar(50) not null,
  create_date date default sysdate,
  update_date date default sysdate,
  business_description varchar(50)
);

select * from business_way;
comment on column business_way.business_id is 'id';
comment on column business_way.business_name is '业务名称';
comment on column business_way.business_code is '业务编码';
comment on column business_way.create_date is '创建时间';
comment on column business_way.update_date is '更新时间';
comment on column business_way.business_description is '描述';
comment on table business_way is '业务编码表';

drop table engine_rule purge;
create table engine_rule(
  engine_id int not null,
  engine_name varchar(50) not null,
  engine_code varchar(50) not null,
  engine_file varchar2(50) not null,
  engine_expression varchar2(50) not null,
  engine_value varchar2(50) not null,
  engine_description varchar2(50),
  err_info varchar2(200),
  engine_way varchar2(50) not null,
  engine_scenario varchar2(50) not null,
  business_code varchar2(50) not null,
  create_date date default sysdate,
  update_date date default sysdate
);
comment on column engine_rule.engine_id is 'id';
comment on column engine_rule.engine_name is '规则名称';
comment on column engine_rule.engine_description is '规则描述';
comment on column engine_rule.engine_code is '规则编码';
comment on column engine_rule.err_info is '错误信息';
comment on column engine_rule.engine_file is '规则字段';
comment on column engine_rule.engine_expression is '规则表达式';
comment on column engine_rule.engine_value is '规则值';
comment on column engine_rule.engine_way is '规则方式';
comment on column engine_rule.engine_scenario is '规则场景';
comment on column engine_rule.business_code is '规则所属业务';
comment on column engine_rule.create_date is '创建时间';
comment on column engine_rule.update_date is '更新时间';
comment on table engine_rule is '业务规则表';
