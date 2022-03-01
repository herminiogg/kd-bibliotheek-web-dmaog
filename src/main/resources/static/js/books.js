var locale = 'en';
if(getLocale !== undefined) {
    locale = getLocale();
}

var filtersConfig = {
        base_path: 'tablefilter/',
        paging: {
          results_per_page: [tableRecordsTitle, [20, 50, 100, 200]],
          btn_next_page_html: '<input type="button" value="" class="pgInp nextPage" title="'+tableNextPageText+'">',
          btn_prev_page_text: '<input type="button" value="" class="pgInp previousPage" title="'+tablePreviousPageText+'">',
          btn_last_page_text: '<input type="button" value="" class="pgInp lastPage" title="'+tableLastPageText+'">',
          btn_first_page_text: '<input type="button" value="" class="pgInp firstPage" title="'+tableFirstPageText+'">',
          page_text: tablePageText,
          of_text: tableOfText,
        },
        state: {
          types: ['local_storage'],
          filters: true,
          page_number: true,
          page_length: true,
          sort: true
        },
        locale: locale,
        alternate_rows: true,
        btn_reset: {tooltip: tableClearFiltersText},
        rows_counter: {text: tableRowsTitle},
        loader: true,
        col_4: 'select',
        clear_filter_text: tableNoFilterText,
        col_types: [
            'number', 'string', 'string',
            'string', 'string', 'string',
            'string'
        ],
        extensions:[{
            name: 'sort'
        }],
        themes: [{
            name: 'transparent'
        }]
    };

window.onload = function () {
    var loadingDiv = document.querySelector("#loading");
    var container = document.querySelector("#tableContainer");
    loadingDiv.style.display = "block";
    container.style.display = "none";

    var tf = new TableFilter(document.querySelector('#booksTable'), filtersConfig);

    container.style.display = "none";

    tf.emitter.on(['initialized'], function() {
        loadingDiv.style.display = "none";
        container.style.display = "block";
    });

    tf.init();
}
