create sequence bm_id_seq start with 1 increment by 50;

create table book_mark
(
    id         bigint  default nextval('bm_id_seq')  not null,
    created_at timestamp(6) with time zone,
    title      varchar(255) not null,
    url        varchar(255) not null,
    primary key (id)
);

-- once you have run the script you are not supposed too changed the script instead you need to run the new script.
-- We can set the credentials for flyway to update the  schema
--- none	No database Schema initialization
-- create	Drops and creates the schema at the application startup. With this option, all your data will be gone on each startup.
-- create-drop	Creates schema at the startup and destroys the schema on context closure. Useful for unit tests.
-- validate	Only checks if the Schema matches the Entities. If the schema doesn’t match, then the application startup will fail. Makes no changes to the database.
-- update	Updates the schema only if necessary. For example, If a new field was added in an entity, then it will simply alter the table for a new column without destroying the data.