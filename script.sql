SELECT c.nombre, c.documento, c.telefono, c.direccion, c.email, c.vetado, 
       ir.id AS ir_id, ir.fechainiciorenta AS ir_fechainiciorenta, ir.fechafinrenta AS ir_fechafinrenta,
       i.id AS it_id, i.nombre AS it_nombre, i.descripcion AS it_descripcion,
       i.fechalanzamiento AS it_fechalanzamiento, i.tarifaxdia AS it_tarifaxdia,
       i.formatorenta AS it_formatorenta, i.genero AS it_genero,
       ti.id AS ti_id, ti.descripcion AS ti_descripcion
FROM VI_CLIENTES c
LEFT JOIN VI_ITEMRENTADO ir ON c.documento = ir.CLIENTES_documento
LEFT JOIN VI_ITEMS i ON ir.ITEMS_id = i.id AND i.id = ir.id
LEFT JOIN VI_TIPOITEM ti ON i.TIPOITEM_id = ti.id AND ti.id = i.id

SELECT * from VI_TIPOITEM;

SELECT * from VI_ITEMS;